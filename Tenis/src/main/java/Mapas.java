import java.util.Map; // importando a interface Map
import java.util.HashMap; //classe para utilização da interface

public class Mapas
{
public static void main(String[] args)
 {
      //Criação do Map, onde o mesmo irá utilizar como chave o nome da empresa para


   Map<String,Object[]>mapa = new HashMap<String,Object[]>();

      //As informações são passadas através de Arrays de Strings,


    String[] localizacao = {"endereco","cnpj","cidade","estado"};
    String[] setores = {"vendas","comercial","suporte"};
    String[] funcionarios = {"Alberto","Henrique","Ana"};
    String[] projetos = {"projeto1","projeto2","projeto3"};

      //É criado uma variável para armazenar os objetos (cada array é um objeto)
  Object[] informacoes = {localizacao,setores,funcionarios,projetos};

  mapa.put("Empresa", informacoes); // é feito o mapeamento entre a empresa e seus dados

      // Os dados foram mapeados, vamos ver como recuperá-los.



  Object[] recDados = mapa.get("Empresa");

   for (int i = 0; i < recDados.length; i++) // array para iterar entre as informações
    {

      // switch utilizado para exibir a informação que está sendo impressa.
           switch (i)
               {
          case 0:
          System.out.println("Localização: ");
           break;
              case 1:
              System.out.println("Setores: ");
                break;
              case 2:
              System.out.println("Funcionários: ");
            break;
              case 3:
              System.out.println("Projetos: ");
            break;
                  }
         //Como o array recDados é do tipo Object e eu tenho a informação


         for (String s : (String[])recDados[i])
           {
            System.out.println(s); // imprime o item para cada array de strings
           }

            System.out.println(); // espaço após terminar a impressão da informação
    }

   }
}