public abstract class NormalLocation extends Location {

    public NormalLocation(Player player, int id, String name) {
        super(player, id, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
