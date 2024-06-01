package com.Tp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<Contact> contacts = new ArrayList<>();
    private int contactIdCounter = 1;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            contacts.removeIf(contact -> contact.getId() == id);
        } else if (action != null && action.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            for (Contact contact : contacts) {
                if (contact.getId() == id) {
                    request.setAttribute("contact", contact);
                    request.getRequestDispatcher("/modify-contact.jsp").forward(request, response);
                    return;
                }
            }
        }
        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("/contacts.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String nom = request.getParameter("nom");
            String numeroTelephone = request.getParameter("numeroTelephone");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            String competenceFavorite = request.getParameter("competenceFavorite");
            for (Contact contact : contacts) {
                if (contact.getId() == id) {
                    contact.setNom(nom);
                    contact.setNumeroTelephone(numeroTelephone);
                    contact.setEmail(email);
                    contact.setAdresse(adresse);
                    contact.setCompetenceFavorite(competenceFavorite);
                    break;
                }
            }
        } else {
            String nom = request.getParameter("nom");
            String numeroTelephone = request.getParameter("numeroTelephone");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            String competenceFavorite = request.getParameter("competenceFavorite");
            if (nom != null && numeroTelephone != null && email != null && adresse != null && competenceFavorite != null) {
                contacts.add(new Contact(contactIdCounter++, nom, numeroTelephone, email, adresse, competenceFavorite));
            }
        }
        response.sendRedirect("contacts");
    }
}
