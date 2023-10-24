package ma.ensa.projetws;

import static android.content.ContentValues.TAG;
import static java.sql.Types.NULL;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import ma.ensa.projetws.adapter.EtudiantAdapter;
import ma.ensa.projetws.beans.Etudiant;

public class StudentListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Etudiant> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        // Initialisation de la liste des étudiants (peut provenir de la base de données ou d'autres sources)
        studentList = new ArrayList<>();
        studentList.add(new Etudiant(NULL,"Jalaoui", "Salma","Casablanca","femme"));
        studentList.add(new Etudiant(NULL,"Hansal", "Nada","Rabat","femme"));
        studentList.add(new Etudiant(NULL,"Khabbachi", "Noha","Agadir","femme"));
        studentList.add(new Etudiant(NULL,"Merjane", "Wiam","Casablanca","femme"));

        // Trouvez la RecyclerView dans le layout
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Créez un adaptateur personnalisé pour lier les données à la RecyclerView
        EtudiantAdapter adapter = new EtudiantAdapter(studentList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


}
