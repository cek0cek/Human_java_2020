package work;

import java.text.DecimalFormat;

//import src.orgjava_tutorials.java;

public class JavaStart99_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� �� ���������� �̰���� ����������ϴ� ���α׷���
		//������
/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		
		int abc=(int)(Math.random()*3+1);
		int a5=0;
		System.out.println("1:�ָ� 2:���� 3: �� 4:����");
		System.out.println("1~4? ����>>");
		a5=Integer.parseInt(scanner.nextLine());
		
		switch(a5) {
		case 1:
			if(abc==1) {
			System.out.printf(" �ָ� �����ϴ� \n");
			} else if(abc==2) {
				System.out.printf("���� �̰���ϴ�.\n");
			} else {
				System.out.printf("�� �����ϴ�.\n");
			}
			break;
		case 2:
			if(abc==1) {
			System.out.printf("�ָ� �����ϴ�.\n");
			} else if(abc==2) {
				System.out.printf("���� �����ϴ�.\n");
			} else {
				System.out.printf("�� �̰���ϴ�.\n");
			}
			break;
		case 3:
			if(abc==1) {
			System.out.printf("�ָ� �̰���ϴ�.\n");
			} else if(abc==2) {
				System.out.printf("���� �����ϴ�.\n");
			} else {
				System.out.printf("�� �����ϴ�.\n");
			}
			break;
		case 4:
			System.out.printf("����.\n");
			break;
		default: 
			System.out.printf("�߸��� �Է�.\n");
			break;
			
		}
*/
		//����ǥ���⺻���� ������ �� ������ ������ ����ϴ� ���α׷��� 
		//�����غ��� ���࿡ ������ ������ 1600���� �̶�� 1200������ ������6%�̰�
		//������ 400������ ������ 15%�̴�.
/*
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		DecimalFormat kkk = new DecimalFormat("###,###");
		System.out.print("������ ����>>");
		int money= Integer.parseInt(scanner.nextLine());
		int tax =0;
		
		if(money<=120000000) {
			tax+=money*0.06;
		} else if ((money >120000000) && (money <=46000000)) {
			tax+=money*0.15 + 1080000;
		} else if ((money >460000000) && (money <=88000000)) {
			tax+=money*0.24 + 5220000;
		} else if ((money >880000000) && (money <=150000000)) {
			tax+=money*0.35 + 14900000;	
		} else if ((money >150000000) && (money <=300000000)) {
			tax+=money*0.38 + 19400000;	
		} else if ((money >300000000) && (money <=500000000)) {
			tax+=money*0.40 + 25400000;
		} else if (money >500000000) {
			tax+=money*0.42 + 35400000;	
		} else {
			System.out.println("�߸��� �Է�");
		}	
		
		System.out.println("���� = "+kkk.format(tax)+"��");

*/
		//����ڰ� �˰� �ִ� ��ü���������ϳ��� �Է¹޾� 
		//�ش� �̱�������� �ѱ������ ����Ͻÿ�
/*		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("");
		
		System.out.println("��ü������ �Է�:0.���� 1. ��ѷ�(cm) 2.�����ѷ� (cm) 3.�ȱ���(cm), 4.�㸮�ѷ�(inch).  >>");
		int sss= Integer.parseInt(scanner.nextLine());
		
		System.out.println("�Է��ϼ���.?>>");
		int sgs= Integer.parseInt(scanner.nextLine());
				
		switch(sss) {
				
		   case 1 :
				if((33 <= sgs) || (35>sgs)) {
					System.out.println("�ѱ� SIZE : 90~95 ,  �̱�SIZE:S");
				} else if ((36<=sgs) && (37>sgs)) {
					System.out.println("�ѱ� SIZE : 95~100 , �̱�SIZE:M");
				} else if ((38<=sgs) && (39>sgs)) {
					System.out.println("�ѱ� SIZE : 100~105 , �̱�SIZE:L");
				} else if ((41<=sgs) && (42>sgs)) {
					System.out.println("�ѱ� SIZE : 105~120 , �̱�SIZE:XL");
				} else if ((43<=sgs) && (45>sgs)) {
					System.out.println("�ѱ� SIZE : 110�̻� , �̱�SIZE:XXL");
				} else {
					System.out.println("�߸��Է��߽��ϴ�.");
				}
					
				break;
			case 2 :
				
				if((86<=sgs) && (91>sgs)) {
					System.out.println("�ѱ� SIZE : 90~95 ,  �̱�SIZE:S");
				} else if ((96 <=sgs) && (102>sgs)) {
					System.out.println("�ѱ� SIZE : 95~100 , �̱�SIZE:M");
				} else if ((107 <=sgs) && (112>sgs)) {
					System.out.println("�ѱ� SIZE : 100~105 , �̱�SIZE:L");
				} else if ((117 <=sgs) && (122>sgs)) {
					System.out.println("�ѱ� SIZE : 105~120 , �̱�SIZE:XL");
				} else if ((127 <=sgs) && (132>sgs)) {
					System.out.println("�ѱ� SIZE : 110�̻� , �̱�SIZE:XXL");
				} else {
					System.out.println("�߸��Է��߽��ϴ�.");
				}
				break;
					
			case 3 :
				
				if((78<=sgs) && (81>sgs)) {
					System.out.println("�ѱ� SIZE : 90~95 ,  �̱�SIZE:S");
				} else if ((81<=sgs) && (84>sgs)) {
					System.out.println("�ѱ� SIZE : 95~100 , �̱�SIZE:M");
				} else if ((84<=sgs) && (86>sgs)) {
					System.out.println("�ѱ� SIZE : 100~105 , �̱�SIZE:L");
				} else if ((86<=sgs) && (89>sgs)) {
					System.out.println("�ѱ� SIZE : 105~120 , �̱�SIZE:XL");
				} else if ((89<=sgs) && (91>sgs)) {
					System.out.println("�ѱ� SIZE : 110�̻� , �̱�SIZE:XXL");
				} else {
					System.out.println("�߸��Է��߽��ϴ�.");
				}
				break;		
			case 4 :
				
				if((28<=sgs) && (29>sgs)) {
					System.out.println("�ѱ� SIZE : 90~95 ,  �̱�SIZE:S");
				} else if ((30<=sgs) && (31>sgs)) {
					System.out.println("�ѱ� SIZE : 95~100 , �̱�SIZE:M");
				} else if ((32<=sgs) && (34>sgs)) {
					System.out.println("�ѱ� SIZE : 100~105 , �̱�SIZE:L");
				} else if ((34<=sgs) && (37>sgs)) {
					System.out.println("�ѱ� SIZE : 105~120 , �̱�SIZE:XL");
				} else if ((38<=sgs) && (40>sgs)) {
					System.out.println("�ѱ� SIZE : 110�̻� , �̱�SIZE:XXL");
				} else {
					System.out.println("�߸��Է��߽��ϴ�.");
				} 
				break;				
			default :
				System.out.println("�߸��Է��߽��ϴ�");
				break;
				
				}
*/
		//���ء�,��������, ���ޡ�, ������ �� �̿��ؼ� ������ ���� 7���� ��� �ɼ� �ִ� ������ if����
		//boolean������ flag�������� �����ϰ� flag������ ������ ����. ��Ʈ�� ������ ���� ¦�̴�.
		//�ڵ带 �ۼ��ϰ� �Ʒ��Ͱ��� ����� ���ü� �ִ� flag���� �����غ���.
		
		
		
	
		
		
		
		
		
		
		
	}

}
