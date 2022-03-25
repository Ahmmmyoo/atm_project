public class backEnd {
    int ID, password;

    // The set methods are used so that we can further edit the data, if we want in
    // the future.
    // The get erthod is used so that we can recieve the data directly, without
    // accessing the set Methd.
    public int setID(int ID) {
        this.ID = ID;
        return ID;
    }

    public int getID() {
        return ID;
    }

    public int setPassword(int password) {
        this.password = password;
        return password;
    }

    public int getPassword() {
        return password;
    }
}
