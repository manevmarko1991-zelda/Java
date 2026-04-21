package marko_manev;

public class Books_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 books buch1= new books();
		 books buch2=new books();
		 
		 buch1.title="neam procitano niedna od nego ";
		 buch1.author="krste petkov misirkov";
		 buch1.seiten = 150;
		 buch2.title="zoki poki";
		 buch2.author="marko manev";
		 buch2.seiten = 45;
		
		
		System.out.println("Titel: " + buch1.title + ", Autor: " + buch1.author + ", Seiten: " + buch1.seiten);
	       System.out.println("Titel: " + buch2.title + ", Autor: " + buch2.author + ", Seiten: " + buch2.seiten);
	}}


