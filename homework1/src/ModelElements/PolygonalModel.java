package ModelElements;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;


public class PolygonalModel {

    public List<Polygon> Polygons;
    public List<Texture> Textures;

    public PolygonalModel(List<Texture> Textures) {
        this.Polygons = new ArrayList<>();
        this.Textures = Textures;

        this.Polygons.add(new Polygon((List<Point3D>) new Point3D()));
    }
}