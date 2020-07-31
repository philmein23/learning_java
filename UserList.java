
import java.util.ArrayList;

class UserList {
    private ArrayList<String> userList;

    UserList() {
        this.userList = new ArrayList<>();
    }

    public void addToList(String name) {
        this.userList.add(name);
    }

    public void printNames() {

        for (String user : this.userList) {
            System.out.println("User " + user);
        }

    }
}