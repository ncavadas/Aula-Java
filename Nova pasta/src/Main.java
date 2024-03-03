import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locatario joao = new Locatario(123l,"João zé");
        Veiculo argo = new Veiculo(1233l,"Fiat",
                "Argo",23.0,90.);
        Veiculo marea = new Veiculo(1235l,"Fiat",
                "Marea",24.,45.);
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yy");
        Date data1 = formatoData.parse("01-01-24");
        Date data2 = formatoData.parse("15-01-24");
        Date data3 = formatoData.parse("02-02-24");
        Date data4 = formatoData.parse("04-02-24");
        Locacao l1 = new Locacao(1230l,10l,40l,data3,data4,false,argo,joao);
        Locacao l2 = new Locacao(1233l,40l,400l,data1,data2,false,argo,joao);
        Locacao l3 = new Locacao(1234l,400l,600l,data1,data4,false,argo,joao);
        System.out.println(joao.divida());

    }

}
