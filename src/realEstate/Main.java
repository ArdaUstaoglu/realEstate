package realEstate;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<City> cities=new ArrayList<>();
		cities.add(new City("Bolu", "T�rkiye", 1.000));//0
		cities.add(new City("�stanbul", "T�rkiye", 3.000));//1
		cities.add(new City("Ankara", "T�rkiye", 5.000));//2
		cities.add(new City("Paris", "�ngiltere", 5.530));//3
		cities.add(new City("Ordu", "T�rkiye", 1.500));//4
		
		ArrayList<Location> locations=new ArrayList<>();
		locations.add(new Location("Merkez", "Bah�elievler Mahallesi"));
		locations.get(0).setCity(cities.get(0));//0
		
		locations.add(new Location("Sultan Ahmet", "Yeni Mahalle"));
		locations.get(1).setCity(cities.get(2));//1
		
		locations.add(new Location("�rencik", "500.Evler"));
		locations.get(2).setCity(cities.get(0));//2
		
		locations.add(new Location("Merkez", "Akta� Mahallesi"));
		locations.get(3).setCity(cities.get(0));//3
		
		locations.add(new Location("Orhaniye", "Be�kavaklar Mahallesi"));
		locations.get(4).setCity(cities.get(0));//4

		ArrayList<Category> categories=new ArrayList<>();
		categories.add(new Category("Lutz", "Kezona"));//0
		categories.add(new Category("Araba", "BitSkit"));//1
		categories.add(new Category("Arsa", "SpaceChase"));//2
		categories.add(new Category("Depo", "Software Flair"));//3
		categories.add(new Category("Ev", "Zavos"));//4
		
		ArrayList<EstateAgent> estateAgents=new ArrayList<>();
		estateAgents.add(new EstateAgent("Arda", "Natolo", "0583 671 34 34", "Arda@gmail.com", locations.get(0)));
		estateAgents.add(new EstateAgent("Emir �ahin", "Fortiva", "0591 344 83 45", "Emir�ahin@gmail.com", locations.get(1)));
		estateAgents.add(new EstateAgent("Adem", "Avanta", "0534 913 47 62", "Adem@gmail.com", locations.get(2)));
		estateAgents.add(new EstateAgent("Enes", "Noat", "0546 913 54 82", "Enes@gmail.com", locations.get(3)));
		estateAgents.add(new EstateAgent("Muhammed Yasin", "Naruto", "0554 518 43 96", "Muhammed Yasin@gmail.com", locations.get(4)));
		
		ArrayList<Advert> adverts=new ArrayList<>();
		adverts.add(new Advert("�ndirimde", "Depo", "1960", "Sahibinden Sat�l�k", 9421.64, 6000.15, "Yok", "Evet",categories.get(3),locations.get(0),estateAgents.get(2)));
		adverts.add(new Advert("Yok", "Arsa", "2022", "Devren Sat�l�k", 2051.54, 4500.4, "Yok", "Evet",categories.get(0),locations.get(1),estateAgents.get(3)));
		adverts.add(new Advert("Yeni", "Araba", "2018", "Devren Sat�l�k", 15000.50, 500.0, "Yok", "Evet", categories.get(1), locations.get(4), estateAgents.get(0)));
		adverts.add(new Advert("Yok", "Ev", "1999", "Sahibinden Kiral�k", 3000, 3500.5,"Yok", "Evet", categories.get(2), locations.get(3), estateAgents.get(4)));	
		adverts.add(new Advert("G�zel", "�ato", "1612", "Sahibinden Sat�l�k", 19000, 25000, "Yok", "Evet", categories.get(4), locations.get(2), estateAgents.get(1)));
		adverts.add(new Advert("Yeni", "Araba", "2515", "Devren Sat�l�k", 5870.50, 501, "Yok", "Evet", categories.get(0), locations.get(4), estateAgents.get(2)));
		adverts.add(new Advert("Yok", "Ev", "2019", "Sahibinden Kiral�k", 7000, 3400,"Yok", "Evet", categories.get(2), locations.get(3), estateAgents.get(0)));	
		adverts.add(new Advert("M�ti�", "Villa", "1612", "Sahibinden Sat�l�k", 14000, 6000, "Yok", "Evet", categories.get(4), locations.get(0), estateAgents.get(1)));
		
		for(Advert advert:adverts) {
			System.out.println("<----------------->");
			System.out.println("---Sat�� Bilgileri---");
			System.out.println("A��klama :"+advert.getOzellik());
			System.out.println("�lan Ad� :"+advert.getName());
			System.out.println("�lan Tarihi :"+advert.getAdvertDate());
			System.out.println("�lan Tipi :"+advert.getAdvertType());
			System.out.println("Kategori :"+advert.getCategory().getName());
			System.out.println("Fiyat :"+advert.getPrice());
			System.out.println("Y�z �l��m� :"+advert.getArea());
			System.out.println("Konum :"+advert.getLocation().getCity().getName()+" "+advert.getLocation().getCity().getCountry());
			System.out.println("Ki�i Bilgisi :"+advert.getEstateAgent().getName());
		}
	}
}