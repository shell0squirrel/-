//ʹ������
class CSTest001
{
	public static void main(String[]args)
	{
		System.out.println("----------��Ϸ��ʼ----------");
		while(gainPerson.getAllGangsterHP()>0&&gainPerson.getAllPoliceHP()>0)
		{
			//���ѡ��������ɫ
			Person person1=gainPerson.getPerson(Tools.getRandom(20));
			Person person2=gainPerson.getPerson(Tools.getRandom(20));
			//���й���
			System.out.print(person1);
			System.out.print("<--VS-->");
			System.out.println(person2);
			person1.attack(person2);
			//�������
			
		}
		System.out.println("����Ѫ�� "+gainPerson.getAllPoliceHP());
		System.out.println("����Ѫ�� "+gainPerson.getAllGangsterHP());
		if(gainPerson.getAllPoliceHP()==0)
			System.out.println("��ͽ��ʤ��");
		else
			System.out.println("�����ʤ��");
		System.out.println("----------��Ϸ����----------");
	}
}
