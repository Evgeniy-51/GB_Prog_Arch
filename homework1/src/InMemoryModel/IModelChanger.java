package InMemoryModel;

public interface IModelChanger {
    //  Зависимость
    public void NotifyChange(IModelChanger sender);
}
