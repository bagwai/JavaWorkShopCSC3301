class Sphere{
  float radius = 0;

public Sphere(float rad){
   radius = rad;
 }
  float calcVolume(){
    float rad = radius;
    float volumeOfSphere = (4f/3f)*(22f/7f)*rad*rad*rad;
    System.out.println("The Volume of the Sphere with radius "+ rad + " cm is : " + volumeOfSphere+" square centimeter");
    return volumeOfSphere;
}
    float getRadius(){
          return this.radius;
  }
  float heightContactPoint(Sphere secondShpere){
    float contactPoint = (2*getRadius()*secondShpere.radius)/(getRadius()+secondShpere.radius);
    System.out.println("The height of The Contact Point between the two Spheres is: " + contactPoint);
    return contactPoint;
  }
}
public class TestSphere{
  public static void main(String[] args) {

    Sphere firstSphere = new Sphere(7f);
    Sphere thirdSpere = new Sphere(14f);
    Sphere secondShpere = new Sphere(14f);

    firstSphere.calcVolume();
    secondShpere.calcVolume();
    thirdSpere.calcVolume();
    firstSphere.heightContactPoint(secondShpere);
    secondShpere.heightContactPoint(thirdSpere);
    thirdSpere.heightContactPoint(firstSphere);
  }
}
