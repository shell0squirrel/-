//储存数据
//数据：武器库、角色库
//建立联系
//建立一个武器库，有10种武器
class WeaponData
{
	static Weapon[] weapon=new Weapon[10];
	static String[] name={"砖头","手枪","步枪","激光枪","机关枪","手雷","匕首","刀子","木棒","手榴弹"};
	static int[] Attack={20,30,40,50,60,70,80,10,25,65};
	static {
		for(int i=0;i<10;i++)
		weapon[i]=new Weapon(name[i],Attack[i]);
	}
}
//建立一个角色库，里面有10个匪10个警
class PersonData
{
	static Person[] person=new Person[20];
	static
	{
		for(int i=0;i<20;i++)
		{
			if(i<10)
				person[i]=new Police("警"+i,100,gainWeapon.getWeapon(Tools.getRandom(10)));
			else
				person[i]=new Gangster("匪"+(i-10),100,gainWeapon.getWeapon(Tools.getRandom(10)));
		}
	}
}
//生成随机数的工具类
class Tools
{
	public static int getRandom(int n)
	{
		return (int)(Math.random()*n);
	}
}
//给一个随机数就给个武器的工具类
class gainWeapon
{
	public static Weapon getWeapon(int i)
	{
		if (i<0||i>9)
			throw new RuntimeException("没有对应的武器");
		return WeaponData.weapon[i];
	}
}
//随机得到一个角色
class gainPerson
{
	public static Person getPerson(int i)
	{
		if (i<0||i>19)
			throw new RuntimeException("没有对应的角色");
		return PersonData.person[i];
	}

//得到所有警的方法--把角色转换为警


	private static Police[] getAllPolice()
	{
		Police[] AllPolice=new Police[10];
		for(int i=0;i<10;i++)
			AllPolice[i]=(Police)PersonData.person[i];
		return AllPolice;
	}

//得到所有匪的方法


	private static Gangster[] getAllGangster()
	{
		Gangster[] AllGangster=new Gangster[10];
		for(int i=0;i<10;i++)
			AllGangster[i]=(Gangster)PersonData.person[i+10];
		return AllGangster;
	}

//得到所有警的生命值的方法


	public static int getAllPoliceHP()
	{
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum+=getAllPolice()[i].getHP();
		}
		return sum;
	}

//得到所有匪的生命值的方法

	public static int getAllGangsterHP()
	{
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum+=getAllGangster()[i].getHP();
		}
		return sum;
	}
}
