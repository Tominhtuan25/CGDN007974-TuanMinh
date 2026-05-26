package ss6_inhiretance.bai_tap.point;

public class Test {
    public static void main(String[] args) {

                Point2D point2d = new Point2D(1.5f, 2.5f);
                System.out.println("Point2D: " +point2d);

                float[] xy =point2d.getXY();
                System.out.println("Array XY: [" + xy[0] + ", " + xy[1] + "]");

                Point3D point3d = new Point3D(1.0f, 2.0f, 3.0f);
                System.out.println("Point3D: " + point3d);

                float[] xyz = point3d.getXYZ();
                System.out.println("Array XYZ: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
            }
        }
