//收集设置数据属性等
//角色属性
abstract class Person
{
	private String name;//姓名
	private int HP;//生命值
	private Weapon weapon;//具有武器
	Person(String name,int HP,Weapon weapon)
	{
		this.name=name;
		this.HP=HP;
		this.weapon=weapon;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int  getHP()
	{
		return HP;
	}
	public void setHP(int HP)
	{
		this.HP=HP;
	}
	//获得武器的行为
	public Weapon getWeapon()
	{
		return weapon;
	}
	public void setWeapon(Weapon weapon)
	{
		this.weapon=weapon;
	}
	abstract void  attack(Person person);
	//设置打印内容
	public String toString()
	{
		return(name+"生命值还有"+HP+",使用"+weapon);
	}
	
}
class Police extends Person
{
	Police(String name,int HP,Weapon weapon)
	{
		super(name,HP,weapon);
	}
	public void attack(Person person)
	{
		if (!(person instanceof Gangster))
			return;
		Gangster g=(Gangster)person;
		if(g.getHP()>this.getWeapon().getAttack())
			g.setHP(g.getHP()-this.getWeapon().getAttack());//如果是匪徒则受到攻击
		else
			g.setHP(0);
	}
}
class Gangster extends Person
{
	Gangster(String name,int HP,Weapon weapon)
	{
		super(name,HP,weapon);
	}
	public void attack(Person person)
	{
	if (!(person instanceof Police))
			return;
	Police p=(Police)person;
	if(p.getHP()>this.getWeapon().getAttack())
		p.setHP(p.getHP()-this.getWeapon().getAttack());//如果是警察则受到攻击
	else
		p.setHP(0);
	}
}
//武器属性:武器的名字，武器的攻击力
class Weapon
{
	private String name;
	private int Attack;
	Weapon(String name,int Attack)
	{
		this.name=name;
		this.Attack=Attack;
	}
	public int getAttack()
	{
		return Attack;
	}
	public void setAttack(int Attack)
	{
		this.Attack=Attack;
	}
		public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return(name+"攻击值为"+Attack);
	}
	
}