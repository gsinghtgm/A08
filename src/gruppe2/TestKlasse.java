package gruppe2;
/**
 * In der Test Klasse werden die davorigen Klassen gestestet.
 * @author Alagic Semir
 * @since 10.11.2016
 *
 */
public class TestKlasse {
	
	public TestKlasse(){
			
			try{
				for(int i=0;i<=10; i++){
					Rauminhalt r= new Rauminhalt(Math.random()*10,Math.random()*12,Math.random()*6);//Quader
					Zahlen z= new Zahlen(Math.random()*10,Math.random()*12);
					z.add(r.getRaumInhalt());
					System.out.println("Quader: "+r.getRaumInhalt());//Quader
					System.out.println("Maximum: "+ z.getMaximum());
					System.out.println("Minimum: "+ z.getMinimum());
					System.out.println("Summe: "+z.getSumme());
					Rauminhalt r1= new Rauminhalt(Math.random()*10,Math.random()*12);//Zylinder
					System.out.println("Zylinder: "+ r1.getRaumInhalt());//Zylinder
					Rauminhalt r2= new Rauminhalt(Math.random()*10,Math.random()*12,Math.random()*6,Math.random()*8);//Prisma
					System.out.println("Prisma: "+r2.getRaumInhalt());//Prisma
				}
			} catch(NullPointerException e){
				
			}
			
	}
	/**
	 * 
	 * @param args Eclipse
	 * @since 10.11.2016
	 */
	public static void main(String[] args){
		new TestKlasse();
	}
}
 