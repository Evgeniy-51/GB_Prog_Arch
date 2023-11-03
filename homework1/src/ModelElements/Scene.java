package ModelElements;

import Stuff.Type;

import java.util.List;

public class Scene {

    public Integer id;
    public List<PolygonalModel> Models;
    public List<Flash> Flashes;

    public void Scene(Integer id, List<PolygonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.Flashes = flashes;
        this.Models = models;
    }


    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }
}