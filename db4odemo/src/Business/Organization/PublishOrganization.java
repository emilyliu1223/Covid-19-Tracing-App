/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.PublishRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author stacyhuang
 */
public class PublishOrganization extends Organization{
    public PublishOrganization() {
        super(Organization.Type.Publish.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PublishRole());
        return roles;
    }
}
