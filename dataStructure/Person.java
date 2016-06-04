//����0.3��  ��װ��Person�ࡣ
package dataStructure;

public class Person		//Դ�����ļ�������Ϊpublic����ֻ��һ�����ұ������ļ�ͬ��
{
    protected  String name;               //������ʵ����Ա������������Ա
    protected  int age;                           //����

    public Person(String name, int age)          //���췽��
    {
        this.name = name;
        this.age = age;
    } 

    public Person()          //���췽��
    {
        this.name = "";
        this.age = 0;
    } 

    public void setName(String name)                 //���ó�Ա����ֵ
    {
        if (name==null)
            this.name = "";
        else
            this.name = name;
    }

    public void setAge(int age)                     //set()��������
    {
        if (age>0 && age<100)
            this.age = age;
        else
            this.age = 0;
    }

    public String getName()                      //��ó�Ա����ֵ
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String toString()                     //����Object���toString()����
    {
        return this.name+"\t"+this.age;
    }

    public int olderThan(Person p2)              //�Ƚ������˵�����
    {
        return this.age - p2.age;
    }

    public boolean equals(Object obj)                 //����Object���з���
    {
        if (obj  instanceof  Person) 
        {
            Person p2 = (Person)obj;
            return this.name.equals(p2.name) && this.age==p2.age;
        }
        return false;
    }
}

