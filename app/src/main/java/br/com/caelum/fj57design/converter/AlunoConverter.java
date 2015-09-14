package br.com.caelum.fj57design.converter;

import org.json.JSONException;
import org.json.JSONStringer;

import java.util.List;

import br.com.caelum.fj57design.modelo.Aluno;

/**
 * Created by matheus on 10/09/15.
 */
public class AlunoConverter {


    public String toJson(List<Aluno> alunos) {

        JSONStringer jsonStringer = new JSONStringer();

        try {
            jsonStringer.object().key("list").array();
            jsonStringer.object().key("aluno").array();


            for (Aluno aluno : alunos) {

                jsonStringer.object()
                        .key("id").value(aluno.getId())
                        .key("nome").value(aluno.getNome())
                        .key("telefone").value(aluno.getTelefone())
                        .key("endereco").value(aluno.getEndereco())
                        .key("site").value(aluno.getSite())
                        .key("nota").value(aluno.getNota())
                        .endObject();

            }
            jsonStringer.endArray().endObject();
            jsonStringer.endArray().endObject();

            return jsonStringer.toString();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
