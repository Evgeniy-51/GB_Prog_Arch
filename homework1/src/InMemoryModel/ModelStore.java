package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;


    // Агрегация 0..n
    private IModelChangedObserver[] changedObserver;

    public ModelStore(IModelChangedObserver[] changedObserver) throws Exception {
        this.changedObserver = changedObserver;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PolygonalModel(null));
        Scenes.add(new Scene(1, Models, Flashes, Cameras));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
    }

    public Scene GetScene(int id) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
