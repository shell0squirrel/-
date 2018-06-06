//使用数据
class CSTest001
{
	public static void main(String[]args)
	{
		System.out.println("----------游戏开始----------");
		while(gainPerson.getAllGangsterHP()>0&&gainPerson.getAllPoliceHP()>0)
		{
			//随机选中两个角色
			Person person1=gainPerson.getPerson(Tools.getRandom(20));
			Person person2=gainPerson.getPerson(Tools.getRandom(20));
			//进行攻击
			System.out.print(person1);
			System.out.print("<--VS-->");
			System.out.println(person2);
			person1.attack(person2);
			//攻击结果
			
		}
		System.out.println("警总血量 "+gainPerson.getAllPoliceHP());
		System.out.println("匪总血量 "+gainPerson.getAllGangsterHP());
		if(gainPerson.getAllPoliceHP()==0)
			System.out.println("匪徒获胜！");
		else
			System.out.println("警察获胜！");
		System.out.println("----------游戏结束----------");
	}
}
