import java.util.Scanner;

public class mainapp {
static shop shop=new shop();
	public static void main(String[] args) {
		while(true) {
            runshop();              
}
}
public static int selection() {
Scanner input = new Scanner(System.in) ;
	int result=0;
	while(result<1||result>2) {
		System.out.println();
		System.out.println("*****************SELECTION****************");
		System.out.println("1 pour ajouter un article");
		System.out.println("2 pour acheter un article");
		System.out.println("3 pour vendre unarticle");
		System.out.println("4 pour afficher les articles du boutique");
		System.out.println("5 pour afficher le resultat");
		System.out.println("6 fermer le programme");
		System.out.println("verfier selection: ");
		result=input.nextInt();
		System.out.println();
	}
	return result;
}

public static void runshop() {

switch( selection() )

{
case 1:
shop.addToArticle();;
break;

case 2:
shop.buyarticle();;
break;
case 3:
shop.sellArticle();;
break;
case 4:
shop.printALL();
break;
case 5:
shop.result();;
break;
case 6:
System.exit(0);
break;
}

}




}
