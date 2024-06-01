<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des contacts</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Liste des contacts</h1>
        <form action="contacts" method="post">
            <input type="hidden" name="action" value="add">
            <input type="text" name="nom" placeholder="Nom" required>
            <input type="text" name="numeroTelephone" placeholder="Numéro de téléphone" required>
            <input type="email" name="email" placeholder="Email" required>
            <input type="text" name="adresse" placeholder="Adresse" required>
            <input type="text" name="competenceFavorite" placeholder="Compétence favorite" required>
            <button type="submit">Ajouter</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th>Nom</th>
                    <th>Numéro</th>
                    <th>Email</th>
                    <th>Adresse</th>
                    <th>Comp-favorite</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contact" items="${contacts}">
                    <tr>
                        <td>${contact.nom}</td>
                        <td>${contact.numeroTelephone}</td>
                        <td>${contact.email}</td>
                        <td>${contact.adresse}</td>
                        <td>${contact.competenceFavorite}</td>
                        <td>
                            <a href="contacts?action=edit&id=${contact.id}">Modifier</a>
                            <a href="contacts?action=delete&id=${contact.id}">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a class="return-link" href="index.jsp">Retour à l'accueil</a>
    </div>
</body>
</html>
