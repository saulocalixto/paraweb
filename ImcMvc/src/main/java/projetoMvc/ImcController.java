package projetoMvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class ImcController extends HttpServlet {

    @Override
    protected void service(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String resultado = "";
        String tamanho = "";
        String peso = "";

        tamanho = request.getParameter("centimetros");
        peso = request.getParameter("kilos");
        
        ImcModel model = new ImcModel();
        
        if(tamanho != null && peso != null) {
            model.setAltura(Double.parseDouble(tamanho.replaceAll(",",".")));
            model.setKilos(Double.parseDouble(peso.replaceAll(",",".")));
        }
        
        resultado = model.retorneImc();
        
        // Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("resultado", resultado);

        // Redireciona requisição para o JSP.
        request.getRequestDispatcher("/calculoMvc.jsp").forward(request, response);
    }
}
