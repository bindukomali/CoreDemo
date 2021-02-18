
		import java.util.Scanner;
		public class vowel {

			public static void main(String[] args) {
				char c;
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter a Character");
				c =s.next().charAt(0);
if ((c=='a'|| c=='A'|| c=='e'||c=='E'||c=='i'|| c=='I'||c=='o'|| c=='O'||c=='u'||c=='U'))
{
					System.out.println("the enterded char is vowel");
				}else {
						System.out.println("Entered char is constant");
						}
               s.close();
			}
		}



