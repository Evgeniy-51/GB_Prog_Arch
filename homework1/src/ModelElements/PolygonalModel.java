package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {

    public List<Polygon> Polygons;
    public List<Texture> Textures;

    public PolygonalModel(List<Texture> textures) {
        this.Polygons = new ArrayList<>();
        this.Textures = textures;
    }
}