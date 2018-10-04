
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class VelocityTableModel extends AbstractTableModel {
    
    private static String[] colNames = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Übertretung"};
    private ArrayList<Measurement> measure = new ArrayList<>();
    
    public void add(Measurement m) {
        measure.add(m);
        fireTableRowsInserted(measure.size() - 1, measure.size() - 1);
   }
    
    @Override
    public int getRowCount() {
        return measure.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurement m = measure.get(rowIndex);
        return m;
    }
    
}
