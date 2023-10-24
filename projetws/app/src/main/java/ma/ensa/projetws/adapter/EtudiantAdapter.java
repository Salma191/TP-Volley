package ma.ensa.projetws.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import ma.ensa.projetws.R;
import ma.ensa.projetws.beans.Etudiant;

public class EtudiantAdapter extends RecyclerView.Adapter<EtudiantAdapter.StudentViewHolder> {
    private List<Etudiant> studentList;

    public EtudiantAdapter(List<Etudiant> studentList) {
        this.studentList = studentList;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        Etudiant student = studentList.get(position);
        holder.nom.setText(student.getNom());
        holder.prenom.setText(student.getPrenom());
        holder.ville.setText(student.getVille());
        holder.sexe.setText(student.getSexe());
        // Associez d'autres données de l'étudiant à des vues ici si nécessaire
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder {
        public TextView nom;
        public TextView prenom;
        public TextView ville;
        public TextView sexe;


        public StudentViewHolder(View view) {
            super(view);
            nom = view.findViewById(R.id.nom);
            prenom = view.findViewById(R.id.prenom);
            ville = view.findViewById(R.id.ville);
            sexe = view.findViewById(R.id.sexe);
        }
    }
}
