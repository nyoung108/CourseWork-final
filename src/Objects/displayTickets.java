
package Objects;

public class displayTickets {
    private String name;
    private String stand;
    private int row;
    private int column;

    public displayTickets(String name, String stand, int row, int column) {
        this.name = name;
        this.stand = stand;
        this.row = row;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return   " Name: " + name + ", Stand: " + stand + ", Row: " + row + ", Column: " + column;
    }
    
    
}
