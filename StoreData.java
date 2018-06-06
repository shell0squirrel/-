//�ռ������������Ե�
//��ɫ����
abstract class Person
{
	private String name;//����
	private int HP;//����ֵ
	private Weapon weapon;//��������
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
	//�����������Ϊ
	public Weapon getWeapon()
	{
		return weapon;
	}
	public void setWeapon(Weapon weapon)
	{
		this.weapon=weapon;
	}
	abstract void  attack(Person person);
	//���ô�ӡ����
	public String toString()
	{
		return(name+"����ֵ����"+HP+",ʹ��"+weapon);
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
			g.setHP(g.getHP()-this.getWeapon().getAttack());//����Ƿ�ͽ���ܵ�����
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
		p.setHP(p.getHP()-this.getWeapon().getAttack());//����Ǿ������ܵ�����
	else
		p.setHP(0);
	}
}
//��������:���������֣������Ĺ�����
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
		return(name+"����ֵΪ"+Attack);
	}
	
}