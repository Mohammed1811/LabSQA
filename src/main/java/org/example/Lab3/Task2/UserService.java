package org.example.Lab3.Task2;

public class UserService {
    private final UtilisateurApi utilisateurApi;
    public UserService(UtilisateurApi utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }
    public void creerUtilisateur(Utilisateur utilisateur) throws
            ServiceException {
        utilisateurApi.creerUtilisateur(utilisateur);
    }
}
