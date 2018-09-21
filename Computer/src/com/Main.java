package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//computer 1
		Computer com1=new Computer();
	//Mother board
		MotherBoard mb1=new MotherBoard();
		Company mbc1=new Company();
		mbc1.name="Dell";
		mbc1.email="dell@gmail.com";
		mbc1.id="mbc0001";
		CompanyAddress mbca1=new CompanyAddress();
		mbca1.d_no="0001";
		mbca1.street="phase 1";
		mbca1.city="Hyderabad";
		mbca1.state="Telangana";
		mbca1.country="India";
		mbca1.pin=520001;
		mbc1.c=mbca1;
		Bill mbb=new Bill();
		mbb.baseProductPrice=10000;
		mbb.billNo=0001;
		mbb.serviceTax=50;
		mbb.TransportTax=100;
		mbb.stateTax=mbb.stateTax(mbb.baseProductPrice);
		mbb.centralTax=mbb.CentralTax(mbb.baseProductPrice);
		mbb.finalPrice=mbb.FinalPrice(mbb.baseProductPrice);
		
		mb1.B=mbb;
		mb1.c=mbc1;
		mb1.qualityRating="5";
		mb1.warrentyPeriod="1 Years";
		mb1.id="MB0001";
		com1.mb=mb1;
		
	//KeyBoard
		KeyBoard kb1=new KeyBoard();
		Company kbc1=new Company();
		kbc1.name="Dell";
		kbc1.email="dell@gmail.com";
		kbc1.id="kbc0001";
		CompanyAddress kbca1=new CompanyAddress();
		kbca1.d_no="0001";
		kbca1.street="phase 1";
		kbca1.city="Hyderabad";
		kbca1.state="Telangana";
		kbca1.country="India";
		kbca1.pin=520001;
		kbc1.c=kbca1;
		Bill kbb=new Bill();
		kbb.baseProductPrice=1000;
		kbb.billNo=0002;
		kbb.serviceTax=50;
		kbb.TransportTax=100;
		kbb.stateTax=kbb.stateTax(kbb.baseProductPrice);
		kbb.centralTax=kbb.CentralTax(kbb.baseProductPrice);
		kbb.finalPrice=kbb.FinalPrice(kbb.baseProductPrice);
		
		
		kb1.B=kbb;
		kb1.c=kbc1;
		kb1.qualityRating="5";
		kb1.warrentyPeriod="1 Year";
		kb1.id="KB0001";
		com1.kb=kb1;
		
	//CPU
		Cpu cpu1=new Cpu();
		Company cpuc1=new Company();
		cpuc1.name="Dell";
		cpuc1.email="dell@gmail.com";
		cpuc1.id="Cpuc0001";
		CompanyAddress cpuca1=new CompanyAddress();
		cpuca1.d_no="0001";
		cpuca1.street="phase 1";
		cpuca1.city="Hyderabad";
		cpuca1.state="Telangana";
		cpuca1.country="India";
		cpuca1.pin=520001;
		cpuc1.c=cpuca1;
		Bill cpub=new Bill();
		cpub.baseProductPrice=1000;
		cpub.billNo=0003;
		cpub.serviceTax=50;
		cpub.TransportTax=100;
		cpub.stateTax=cpub.stateTax(cpub.baseProductPrice);
		cpub.centralTax=cpub.CentralTax(cpub.baseProductPrice);
		cpub.finalPrice=cpub.FinalPrice(cpub.baseProductPrice);
		
		cpu1.B=cpub;
		cpu1.c=cpuc1;
		cpu1.qualityRating="5";
		cpu1.warrentyPeriod="1 Year";
		cpu1.id="CPU0001";
		cpu1.speed="1Ghz";
		cpu1.type="i3";
		com1.cpu=cpu1;
		
	//Mouse
		Mouse m1=new Mouse();
		Company mc1=new Company();
		mc1.name="Dell";
		mc1.email="dell@gmail.com";
		mc1.id="Mc0001";
		CompanyAddress mca1=new CompanyAddress();
		mca1.d_no="0001";
		mca1.street="phase 1";
		mca1.city="Hyderabad";
		mca1.state="Telangana";
		mca1.country="India";
		mca1.pin=520001;
		mc1.c=mca1;
		Bill m1b=new Bill();
		m1b.baseProductPrice=500;
		m1b.billNo=0004;
		m1b.serviceTax=50;
		m1b.TransportTax=100;
		m1b.stateTax=m1b.stateTax(m1b.baseProductPrice);
		m1b.centralTax=m1b.CentralTax(m1b.baseProductPrice);
		m1b.finalPrice=m1b.FinalPrice(m1b.baseProductPrice);
		
		m1.B=m1b;
		m1.c=mc1;
		m1.qualityRating="5";
		m1.warrentyPeriod="1 Year";
		m1.id="M0001";	
		m1.type="ball model";
		com1.mouse=m1;
		
	//Ram
		Ram r1=new Ram();
		Company rc1=new Company();
		rc1.name="Dell";
		rc1.email="dell@gmail.com";
		rc1.id="Rc0001";
		CompanyAddress rca1=new CompanyAddress();
		rca1.d_no="0001";
		rca1.street="phase 1";
		rca1.city="Hyderabad";
		rca1.state="Telangana";
		rca1.country="India";
		rca1.pin=520001;
		rc1.c=rca1;
		Bill rb=new Bill();
		rb.baseProductPrice=5000;
		rb.billNo=0005;
		rb.serviceTax=50;
		rb.TransportTax=100;
		rb.stateTax=rb.stateTax(rb.baseProductPrice);
		rb.centralTax=rb.CentralTax(rb.baseProductPrice);
		rb.finalPrice=rb.FinalPrice(rb.baseProductPrice);
		
		r1.B=rb;
		r1.c=rc1;
		r1.qualityRating="5";
		r1.warrentyPeriod="1 Year";
		r1.id="R0001";
		r1.capacity="1Gb";
		com1.ram=r1;
		
	//Monitor
		Monitor mo1=new Monitor();
		Company moc1=new Company();
		moc1.name="Dell";
		moc1.email="dell@gmail.com";
		moc1.id="Moc0001";
		CompanyAddress moca1=new CompanyAddress();
		moca1.d_no="0001";
		moca1.street="phase 1";
		moca1.city="Hyderabad";
		moca1.state="Telangana";
		moca1.country="India";
		moca1.pin=520001;
		moc1.c=moca1;
		Bill mob=new Bill();
		mob.baseProductPrice=2000;
		mob.billNo=0005;
		mob.serviceTax=50;
		mob.TransportTax=100;
		mob.stateTax=mob.stateTax(mob.baseProductPrice);
		mob.centralTax=mob.CentralTax(mob.baseProductPrice);
		mob.finalPrice=mob.FinalPrice(mob.baseProductPrice);
		
		mo1.B=mob;
		mo1.c=moc1;
		mo1.qualityRating="5";
		mo1.warrentyPeriod="1 Year";
		mo1.id="Mo0001";
		mo1.width=23;
		mo1.height=12;
		com1.monitor=mo1;

		
//computer 2
		Computer com2=new Computer();
	//Mother board
		MotherBoard mb2=new MotherBoard();
		Company mbc2=new Company();
		mbc2.name="Intel";
		mbc2.email="intel@gmail.com";
		mbc2.id="mbc0002";
		CompanyAddress mbca2=new CompanyAddress();
		mbca2.d_no="0002";
		mbca2.street="phase 2";
		mbca2.city="Hyderabad";
		mbca2.state="Telangana";
		mbca2.country="India";
		mbca2.pin=520001;
		mbc2.c=mbca2;
		Bill mbb2=new Bill();
		mbb2.baseProductPrice=20000;
		mbb2.billNo=0001;
		mbb2.serviceTax=50;
		mbb2.TransportTax=100;
		mbb2.stateTax=mbb2.stateTax(mbb2.baseProductPrice);
		mbb2.centralTax=mbb2.CentralTax(mbb2.baseProductPrice);
		mbb2.finalPrice=mbb2.FinalPrice(mbb2.baseProductPrice);
		
		mb2.B=mbb2;
		mb2.c=mbc2;
		mb2.qualityRating="4";
		mb2.warrentyPeriod="2 Years";
		mb2.id="MB0002";
		com2.mb=mb2;
		
	//KeyBoard
		KeyBoard kb2=new KeyBoard();
		Company kbc2=new Company();
		kbc2.name="Intel";
		kbc2.email="intel@gmail.com";
		kbc2.id="kbc0002";
		CompanyAddress kbca2=new CompanyAddress();
		kbca2.d_no="0002";
		kbca2.street="phase 2";
		kbca2.city="Hyderabad";
		kbca2.state="Telangana";
		kbca2.country="India";
		kbca2.pin=520001;
		kbc2.c=kbca2;
		Bill kbb2=new Bill();
		kbb2.baseProductPrice=1100;
		kbb2.billNo=0002;
		kbb2.serviceTax=50;
		kbb2.TransportTax=100;
		kbb2.stateTax=kbb2.stateTax(kbb2.baseProductPrice);
		kbb2.centralTax=kbb2.CentralTax(kbb2.baseProductPrice);
		kbb2.finalPrice=kbb2.FinalPrice(kbb2.baseProductPrice);
	
		kb2.B=kbb2;
		kb2.c=kbc2;
		kb2.qualityRating="4";
		kb2.warrentyPeriod="2 Year";
		kb2.id="KB0002";
		com2.kb=kb2;
		
	//CPU
		Cpu cpu2=new Cpu();
		Company cpuc2=new Company();
		cpuc2.name="Intel";
		cpuc2.email="dell@gmail.com";
		cpuc2.id="Cpuc0002";
		CompanyAddress cpuca2=new CompanyAddress();
		cpuca2.d_no="0002";
		cpuca2.street="phase 2";
		cpuca2.city="Hyderabad";
		cpuca2.state="Telangana";
		cpuca2.country="India";
		cpuca2.pin=520001;
		cpuc2.c=cpuca2;
		Bill cpub2=new Bill();
		cpub2.baseProductPrice=1100;
		cpub2.billNo=0003;
		cpub2.serviceTax=50;
		cpub2.TransportTax=100;
		cpub2.stateTax=cpub2.stateTax(cpub2.baseProductPrice);
		cpub2.centralTax=cpub2.CentralTax(cpub2.baseProductPrice);
		cpub2.finalPrice=cpub2.FinalPrice(cpub2.baseProductPrice);
		
		cpu2.B=cpub2;
		cpu2.c=cpuc2;
		cpu2.qualityRating="4";
		cpu2.warrentyPeriod="2 Year";
		cpu2.id="CPU0002";
		cpu2.speed="2Ghz";
		cpu2.type="i5";
		com2.cpu=cpu2;
				
	//Mouse
		Mouse m2=new Mouse();
		Company mc2=new Company();
		mc2.name="Intel";
		mc2.email="intel@gmail.com";
		mc2.id="Mc0002";
		CompanyAddress mca2=new CompanyAddress();
		mca2.d_no="0002";
		mca2.street="phase 2";
		mca2.city="Hyderabad";
		mca2.state="Telangana";
		mca2.country="India";
		mca2.pin=520001;
		mc2.c=mca2;
		Bill m2b=new Bill();
		m2b.baseProductPrice=600;
		m2b.billNo=0004;
		m2b.serviceTax=50;
		m2b.TransportTax=100;
		m2b.stateTax=m2b.stateTax(m2b.baseProductPrice);
		m2b.centralTax=m2b.CentralTax(m2b.baseProductPrice);
		m2b.finalPrice=m2b.FinalPrice(m2b.baseProductPrice);
			
		m2.B=m2b;
		m2.c=mc2;
		m2.qualityRating="4";
		m2.warrentyPeriod="2 Year";
		m2.id="M0002";	
		m2.type="wire mouse";
		com2.mouse=m2;

	//Ram
		Ram r2=new Ram();
		Company rc2=new Company();
		rc2.name="Intel";
		rc2.email="Intel@gmail.com";
		rc2.id="Rc0002";
		CompanyAddress rca2=new CompanyAddress();
		rca2.d_no="0002";
		rca2.street="phase 2";
		rca2.city="Hyderabad";
		rca2.state="Telangana";
		rca2.country="India";
		rca2.pin=520001;
		rc2.c=rca2;
		Bill rb2=new Bill();
		rb2.baseProductPrice=10000;
		rb2.billNo=0005;
		rb2.serviceTax=50;
		rb2.TransportTax=100;
		rb2.stateTax=rb2.stateTax(rb2.baseProductPrice);
		rb2.centralTax=rb2.CentralTax(rb2.baseProductPrice);
		rb2.finalPrice=rb2.FinalPrice(rb2.baseProductPrice);
		
		r2.B=rb2;
		r2.c=rc2;
		r2.qualityRating="4";
		r2.warrentyPeriod="2 Year";
		r2.id="R0002";
		r2.capacity="2Gb";
		com2.ram=r2;
			
	//Monitor
		Monitor mo2=new Monitor();
		Company moc2=new Company();
		moc2.name="Intel";
		moc2.email="Intel@gmail.com";
		moc2.id="Moc0002";
		CompanyAddress moca2=new CompanyAddress();
		moca2.d_no="0002";
		moca2.street="phase 2";
		moca2.city="Hyderabad";
		moca2.state="Telangana";
		moca2.country="India";
		moca2.pin=520001;
		moc2.c=moca2;
		Bill mob2=new Bill();
		mob2.baseProductPrice=3000;
		mob2.billNo=0005;
		mob2.serviceTax=50;
		mob2.TransportTax=100;
		mob2.stateTax=mob2.stateTax(mob2.baseProductPrice);
		mob2.centralTax=mob2.CentralTax(mob2.baseProductPrice);
		mob2.finalPrice=mob2.FinalPrice(mob2.baseProductPrice);
		
		mo2.B=mob2;
		mo2.c=moc2;
		mo2.qualityRating="4";
		mo2.warrentyPeriod="2 Year";
		mo2.id="Mo0002";
		mo2.width=24;
		mo2.height=13;
		com2.monitor=mo2;
		
		
//computer 3
		Computer com3=new Computer();
	//Mother board
		MotherBoard mb3=new MotherBoard();
		Company mbc3=new Company();
		mbc3.name="Lenovo";
		mbc3.email="lenovo@gmail.com";
		mbc3.id="mbc0003";
		CompanyAddress mbca3=new CompanyAddress();
		mbca3.d_no="0003";
		mbca3.street="phase 3";
		mbca3.city="Hyderabad";
		mbca3.state="Telangana";
		mbca3.country="India";
		mbca3.pin=520001;
		mbc3.c=mbca3;
		Bill mbb3=new Bill();
		mbb3.baseProductPrice=30000;
		mbb3.billNo=0001;
		mbb3.serviceTax=50;
		mbb3.TransportTax=100;
		mbb3.stateTax=mbb3.stateTax(mbb3.baseProductPrice);
		mbb3.centralTax=mbb3.CentralTax(mbb3.baseProductPrice);
		mbb3.finalPrice=mbb3.FinalPrice(mbb3.baseProductPrice);
			
		mb3.B=mbb3;
		mb3.c=mbc3;
		mb3.qualityRating="3";
		mb3.warrentyPeriod="3 Years";
		mb3.id="MB0003";
		com3.mb=mb3;
		
	//KeyBoard
		KeyBoard kb3=new KeyBoard();
		Company kbc3=new Company();
		kbc3.name="Lenovo";
		kbc3.email="Lenovo@gmail.com";
		kbc3.id="kbc0003";
		CompanyAddress kbca3=new CompanyAddress();
		kbca3.d_no="0003";
		kbca3.street="phase 3";
		kbca3.city="Hyderabad";
		kbca3.state="Telangana";
		kbca3.country="India";
		kbca3.pin=520001;
		kbc3.c=kbca3;
		Bill kbb3=new Bill();
		kbb3.baseProductPrice=2000;
		kbb3.billNo=0002;
		kbb3.serviceTax=50;
		kbb3.TransportTax=100;
		kbb3.stateTax=kbb3.stateTax(kbb3.baseProductPrice);
		kbb3.centralTax=kbb3.CentralTax(kbb3.baseProductPrice);
		kbb3.finalPrice=kbb3.FinalPrice(kbb3.baseProductPrice);
			
		kb3.B=kbb3;
		kb3.c=kbc3;
		kb3.qualityRating="3";
		kb3.warrentyPeriod="3 Year";
		kb3.id="KB0003";
		com3.kb=kb3;
		
	//CPU
		Cpu cpu3=new Cpu();
		Company cpuc3=new Company();
		cpuc3.name="Lenovo";
		cpuc3.email="lenovo@gmail.com";
		cpuc3.id="Cpuc0003";
		CompanyAddress cpuca3=new CompanyAddress();
		cpuca3.d_no="0003";
		cpuca3.street="phase 3";
		cpuca3.city="Hyderabad";
		cpuca3.state="Telangana";
		cpuca3.country="India";
		cpuca3.pin=520001;
		cpuc3.c=cpuca3;
		Bill cpub3=new Bill();
		cpub3.baseProductPrice=1200;
		cpub3.billNo=0003;
		cpub3.serviceTax=50;
		cpub3.TransportTax=100;
		cpub3.stateTax=cpub3.stateTax(cpub3.baseProductPrice);
		cpub3.centralTax=cpub3.CentralTax(cpub3.baseProductPrice);
		cpub3.finalPrice=cpub3.FinalPrice(cpub3.baseProductPrice);
		
		cpu3.B=cpub3;
		cpu3.c=cpuc3;
		cpu3.qualityRating="3";
		cpu3.warrentyPeriod="3 Year";
		cpu3.id="CPU0003";
		cpu3.speed="3Ghz";
		cpu3.type="i7";
		com3.cpu=cpu3;
		
	//Mouse
		Mouse m3=new Mouse();
		Company mc3=new Company();
		mc3.name="Lenovo";
		mc3.email="lenovo@gmail.com";
		mc3.id="Mc0003";
		CompanyAddress mca3=new CompanyAddress();
		mca3.d_no="0003";
		mca3.street="phase 3";
		mca3.city="Hyderabad";
		mca3.state="Telangana";
		mca3.country="India";
		mca3.pin=520001;
		mc3.c=mca3;
		Bill m3b=new Bill();
		m3b.baseProductPrice=700;
		m3b.billNo=0004;
		m3b.serviceTax=50;
		m3b.TransportTax=100;
		m3b.stateTax=m3b.stateTax(m3b.baseProductPrice);
		m3b.centralTax=m3b.CentralTax(m3b.baseProductPrice);
		m3b.finalPrice=m3b.FinalPrice(m3b.baseProductPrice);
		
		m3.B=m3b;
		m3.c=mc3;
		m3.qualityRating="3";
		m3.warrentyPeriod="3 Year";
		m3.id="M0003";	
		m3.type="wireless Mouse";
		com3.mouse=m3;
		
	//Ram
		Ram r3=new Ram();
		Company rc3=new Company();
		rc3.name="lenovo";
		rc3.email="lenovo@gmail.com";
		rc3.id="Rc0003";
		CompanyAddress rca3=new CompanyAddress();
		rca3.d_no="0003";
		rca3.street="phase 3";
		rca3.city="Hyderabad";
		rca3.state="Telangana";
		rca3.country="India";
		rca3.pin=520001;
		rc3.c=rca3;
		Bill rb3=new Bill();
		rb3.baseProductPrice=12000;
		rb3.billNo=0005;
		rb3.serviceTax=50;
		rb3.TransportTax=100;
		rb3.stateTax=rb3.stateTax(rb3.baseProductPrice);
		rb3.centralTax=rb3.CentralTax(rb3.baseProductPrice);
		rb3.finalPrice=rb3.FinalPrice(rb3.baseProductPrice);
		
		r3.B=rb3;
		r3.c=rc3;
		r3.qualityRating="3";
		r3.warrentyPeriod="3 Year";
		r3.id="R0003";
		r3.capacity="3Gb";
		com3.ram=r3;
			
	//Monitor
		Monitor mo3=new Monitor();
		Company moc3=new Company();
		moc3.name="Lenovo";
		moc3.email="lenovo@gmail.com";
		moc3.id="Moc0003";
		CompanyAddress moca3=new CompanyAddress();
		moca3.d_no="0003";
		moca3.street="phase 3";
		moca3.city="Hyderabad";
		moca3.state="Telangana";
		moca3.country="India";
		moca3.pin=520001;
		moc3.c=moca3;
		Bill mob3=new Bill();
		mob3.baseProductPrice=4000;
		mob3.billNo=0005;
		mob3.serviceTax=50;
		mob3.TransportTax=100;
		mob3.stateTax=mob3.stateTax(mob3.baseProductPrice);
		mob3.centralTax=mob3.CentralTax(mob3.baseProductPrice);
		mob3.finalPrice=mob3.FinalPrice(mob3.baseProductPrice);
		
		mo3.B=mob3;
		mo3.c=moc3;
		mo3.qualityRating="3";
		mo3.warrentyPeriod="3 Year";
		mo3.id="Mo0003";
		mo3.width=25;
		mo3.height=14;
		com3.monitor=mo3;
		
		
		
		
//------------------------------------------------------------------------
		System.out.println();
		System.out.println("************ COMPUTER 1 ************");
		com1.display();
		System.out.println("************ COMPUTER 2 ************");
		com2.display(); 
		System.out.println("************ COMPUTER 3 ************");
		com3.display();
		
	}

}
