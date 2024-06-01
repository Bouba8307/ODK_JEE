<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier le contact</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Modifier le contact</h1>
        <form action="contacts" method="post">
            <input type="hidden" name="action" value="edit">
            <input type="hidden" name="id" value="${contact.id}">
            <input type="text" name="nom" placeholder="Nom" value="${contact.nom}" required>
            <input type="text" name="numeroTelephone" placeholder="Numéro de téléphone" value="${contact.numeroTelephone}" required>
            <input type="email" name="email" placeholder="Email" value="${contact.email}" required>
            <input type="text" name="adresse" placeholder="Adresse" value="${contact.adresse}" required>
            <input type="text" name="competenceFavorite" placeholder="Compétence favorite" value="${contact.competenceFavorite}" required>
            <input type="submit" value="Enregistrer les modifications" />
        </form>
        <a href="contacts">Annuler</a>
    </div>
</body>
</html>
