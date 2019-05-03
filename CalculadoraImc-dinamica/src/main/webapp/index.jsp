<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cálculo IMC</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    </head>
        <body>
        <br>
        <form class="container" id="formulario">
            <div class="col-md-5">
                <fieldset class="form-group">
                    <legend>Calcule IMC</legend>
                    <label for="kilos">Peso:</label>
                    <input type="number" name="kilos" class="form-control" />

                    <label for="centimetros">Tamanho (cm):</label>
                    <input type="number" name="centimetros" class="form-control" />

                    <label for="inputState">Sexo</label>
                    <select id="inputState" class="form-control">
                        <option selected>Masculino</option>
                        <option selected>Feminino</option>
                    </select>
                    <br>
                    <button type="submit" class="btn btn-primary">Calcular</button>
                    <br>
                    <br>
                    <div  class="alert alert-success seuImc" id="seuImc">
                        <%

                            String kilosText = request.getParameter("kilos");
                            String cmText = request.getParameter("centimetros");

                            if(kilosText != null && cmText != null) {

                                Double kilos = Double.parseDouble(kilosText.replaceAll(",","."));
                                Double cm = Double.parseDouble(cmText.replaceAll(",","."));
    
                                Double altura = (cm) / 100;

                                Double imc = kilos / (altura * altura);

                                out.print(String.format("%.2f", imc));

                            }
                        %>
                    </div>
                </fieldset>
            </div>
        </form>
        </body>
</html>
