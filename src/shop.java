

	import java.util.Scanner;
public class shop {
	private static double exprenses;
	private static double income;
	private static Article [] articles=new Article[100];
static Scanner input=new Scanner(System.in);

public Article  createnewArticle() {
	
	String articleName=null;
	double buyPrice=0,sellPrice=0;
	while(articleName==null|| buyPrice==0||sellPrice==0) {
	System.out.println("Nom d'article:");
	articleName=input.nextLine();
	System.out.println("prix d'achat:");
	 buyPrice=input.nextDouble();
	System.out.println("prix de vente:");
	sellPrice=input.nextDouble();
	input.nextLine();
	System.out.println();
	}
	return new Article(articleName, buyPrice,sellPrice);
}	


public double getExprenses() {
	return exprenses;
}
public void setExprenses(double exprenses) {
	shop.exprenses = exprenses;
}
public double getIncome() {
	return income;
}
public void setIncome(double income) {
	shop.income = income;
}

public  void addToArticle() {
	for(int x=0;x<articles.length;x++) {
		if(articles[x]==null) {
		articles[x]= createnewArticle() ;
		x=articles.length;
	                          }    } }


public  void printALL() {
	
	for(int x=0;x<articles.length;x++) {
		if(articles[x]!=null) {
			System.out.println("Numero: "+(x+1)+" Nom: "+articles[x].getName()+" stock:  " + articles[x].getStock());
		}
		}
	}
public void buyarticle() {
	
	int articleNumber=-1,quatit�=0;
	
	while( articleNumber<0||articles[ articleNumber]==null)
	{
		System.out.println("Numero d'article acheter: ");
		 articleNumber=input.nextInt()-1;
		input.nextLine();
		}
	System.out.println();
	while(quatit�<1)
	{
		System.out.println("Numero d'article acheter: ");
		quatit�=input.nextInt();
		input.nextLine();	
		
	}
	articles[articleNumber].setStock(articles[articleNumber].getStock()+quatit�);
	exprenses+=articles[articleNumber].getBuyPrice()*quatit�;

}
public  void result() {
	
	
	System.out.println(income-exprenses+"Euro");}

	public   void sellArticle() {
		
		int articleNumber=-1,quatit�=0;
		while( articleNumber<0||articles[ articleNumber]==null)
		{
			System.out.println("Numero d'article vendue: ");
			 articleNumber=input.nextInt()-1;	
		}
		System.out.println();
		
		while( quatit�<1||articles[articleNumber].getStock()<quatit�)
		{
			System.out.println("Numero d'article vendue: ");
			quatit�=input.nextInt();
			
		
		if(quatit�>articles[articleNumber].getStock()
)
		
		{
			System.out.println("la quantit� en vente et plus grand que la quntit� en stock" );
			System.out.println();
		
	}
		
		}

		
	
		articles[articleNumber].setStock(articles[articleNumber].getStock()-quatit�);
		income+=articles[articleNumber]. getSallPrice()*quatit�;
	}
	

}