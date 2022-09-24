<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

</head>
<body>

    <div class="container">
        <h1 class="display-6">Caclulator</h1>

        <div class="row">
            <div class="col col-md-3">

                <form action="/calculate" method="post"> <!-- should be same as url-pattern in web.xml -->
                    <div class="form-group mb-3">
                        <label for="num1">Enter number 1</label>
                        <!-- <input type="number" name="num1" id="num1"> -->
                        <input type="text" inputmode="numeric" pattern="\d*" name="num1" id="num1" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                        <label for="num2">Enter number 2</label>
                        <!-- <input type="number" name="num2" id="num2"> -->
                        <input type="text" inputmode="numeric" pattern="\d*" name="num2" id="num2" class="form-control">
                    </div>
                    <div class="form-group mb-3">
                        <input type="submit" value="Add" class="btn btn-lg btn-info">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

</body>
</html>