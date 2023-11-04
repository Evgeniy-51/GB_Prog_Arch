package ModelElements;

import Stuff.Type;

import java.util.List;

public class Scene {

    public Integer id;
    public List<PolygonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras;


    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }
    }



    public Type method1(Type type) {
        return type;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }
}