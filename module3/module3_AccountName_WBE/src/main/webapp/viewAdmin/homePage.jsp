
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <style>
        .header {
            width: 98vw;
            height: 60px;
            margin-bottom: 5px;
            border-bottom: 2px solid gray;
            display: inline-block;
        }
        .header h3 {
            display:inline-block;
            height: 30px;
            width: 100px;
            text-align: left;
        }
        #name {
            text-align: right;
            display: inline-block;
            width: 100px;
            height: 30px;
            margin-left: 1100px;
        }
        .mid{
            display: inline-block;
            width: 50vw;
            height: 80vh;
            color: darkblue;
            text-align: right;
        }
        #navbarSupportedContent ul li {
            padding-left: 40px;
        }
        #navbarSupportedContent ul li a {
            color: white;

        }
    </style>
</head>
<body>
<div class="header">
    <h3>LoGo</h3>
    <p id="name">Thai Van Huy </p>
</div>
<nav class="navbar navbar-expand-lg navbar-light  " style="background-color: #5F9EA0">
    <div class="container-fluid">
        <a class="navbar-brand" href="#" style="color: white">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="margin-left: 130px" >
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/Admin">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/customer">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Contract</a>
                </li>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link" href="#">Employee</a>--%>
<%--                </li>--%>
<%--                <li class="nav-item dropdown">--%>
<%--                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">--%>
<%--                        Dropdown--%>
<%--                    </a>--%>
<%--                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">--%>
<%--                        <li><a class="dropdown-item" href="#">Action</a></li>--%>
<%--                        <li><a class="dropdown-item" href="#">Another action</a></li>--%>
<%--                        <li><hr class="dropdown-divider"></li>--%>
<%--                        <li><a class="dropdown-item" href="#">Something else here</a></li>--%>
<%--                    </ul>--%>
<%--                </li>--%>
<%--                <li class="nav-item">--%>
<%--                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>--%>
<%--                </li>--%>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit" style="color: white">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="card" style="width: 18rem;margin-top: 10px; display: inline-block">
    <img src="https://www.hilton.com/im/en/NoHotel/15196649/shutterstock-1041475570.jpg?impolicy=crop&cw=4541&ch=3333&gravity=NorthWest&xposition=229&yposition=0&rw=582&rh=427" class="card-img-top" alt="...">
    <div class="card-body">
        <h5 class="card-title">Card with stretched links</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <p class="card-text">
            <a href="#" class="stretched-link text-danger" style="position: relative;">Stretched link will not work here, because <code>position: relative</code> is added to the link</a>
        </p>
        <p class="card-text bg-light" style="transform: rotate(0);">
            This <a href="#" class="text-warning stretched-link">stretched link</a> will only be spread over the <code>p</code>-tag, because a transform is applied to it.
        </p>
    </div>
</div>
<div class="row g-0 bg-light position-relative" style="width: 70vw; display: inline-block; margin-top: 20px;text-align: left;padding-left: 10px" >
    <div class="d-flex" style="position: absolute; bottom: 260px">
        <img src="https://toptravelvn.com/wp-content/uploads/2017/11/Du-lich-cau-rong-Da-Nang-chiec-cau-co-kha-nang-phun-lua-h1-434x308.jpg" class="flex-shrink-0 me-3" alt="..." height="240px">
        <div>
            <h5 class="mt-0">Custom component with stretched link</h5>
            <p>This is some placeholder content for the custom component. It is intended to mimic what some real-world content would look like, and we're using it here to give the component a bit of body and size.</p>
            <a href="#" class="stretched-link">Go somewhere</a>
        </div>
    </div>
    <div class="d-flex" style="position: absolute; bottom: 10px">
        <img src="https://nhadepso.com/wp-content/uploads/2021/09/resort-la-gi_nhadepso.jpg" class="flex-shrink-0 me-3" alt="..." height="240px" width="340px">
        <div>
            <h5 class="mt-0">Custom component with stretched link</h5>
            <p>This is some placeholder content for the custom component. It is intended to mimic what some real-world content would look like, and we're using it here to give the component a bit of body and size.</p>
            <a href="#" class="stretched-link">Go somewhere</a>
        </div>
    </div>
</div>
</body>
</html>
