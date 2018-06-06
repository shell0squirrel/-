//��������
//���ݣ������⡢��ɫ��
//������ϵ
//����һ�������⣬��10������
class WeaponData
{
	static Weapon[] weapon=new Weapon[10];
	static String[] name={"שͷ","��ǹ","��ǹ","����ǹ","����ǹ","����","ذ��","����","ľ��","����"};
	static int[] Attack={20,30,40,50,60,70,80,10,25,65};
	static {
		for(int i=0;i<10;i++)
		weapon[i]=new Weapon(name[i],Attack[i]);
	}
}
//����һ����ɫ�⣬������10����10����
class PersonData
{
	static Person[] person=new Person[20];
	static
	{
		for(int i=0;i<20;i++)
		{
			if(i<10)
				person[i]=new Police("��"+i,100,gainWeapon.getWeapon(Tools.getRandom(10)));
			else
				person[i]=new Gangster("��"+(i-10),100,gainWeapon.getWeapon(Tools.getRandom(10)));
		}
	}
}
//����������Ĺ�����
class Tools
{
	public static int getRandom(int n)
	{
		return (int)(Math.random()*n);
	}
}
//��һ��������͸��������Ĺ�����
class gainWeapon
{
	public static Weapon getWeapon(int i)
	{
		if (i<0||i>9)
			throw new RuntimeException("û�ж�Ӧ������");
		return WeaponData.weapon[i];
	}
}
//����õ�һ����ɫ
class gainPerson
{
	public static Person getPerson(int i)
	{
		if (i<0||i>19)
			throw new RuntimeException("û�ж�Ӧ�Ľ�ɫ");
		return PersonData.person[i];
	}

//�õ����о��ķ���--�ѽ�ɫת��Ϊ��


	private static Police[] getAllPolice()
	{
		Police[] AllPolice=new Police[10];
		for(int i=0;i<10;i++)
			AllPolice[i]=(Police)PersonData.person[i];
		return AllPolice;
	}

//�õ����з˵ķ���


	private static Gangster[] getAllGangster()
	{
		Gangster[] AllGangster=new Gangster[10];
		for(int i=0;i<10;i++)
			AllGangster[i]=(Gangster)PersonData.person[i+10];
		return AllGangster;
	}

//�õ����о�������ֵ�ķ���


	public static int getAllPoliceHP()
	{
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum+=getAllPolice()[i].getHP();
		}
		return sum;
	}

//�õ����з˵�����ֵ�ķ���

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
