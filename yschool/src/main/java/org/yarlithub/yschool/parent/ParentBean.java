package org.yarlithub.yschool.parent;

import org.apache.log4j.Logger;
import org.yarlithub.yschool.repository.Parent;
import org.yarlithub.yschool.util.InitialDateLoaderUtil;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jaykrish
 * Date: 4/25/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean
@SessionScoped
public class ParentBean implements Serializable {

    private static final Logger logger = Logger.getLogger(ParentBean.class);

    @ManagedProperty(value = "#{initialDateLoaderUtil}")
    private InitialDateLoaderUtil initialDateLoaderUtil;

    public Parent parent;
    private List<Parent> parentList;
    private List<String> genderList = Arrays.asList("Male", "Female");

    public ParentBean() {
        logger.info("initiating a new parent bean");
        parent = new Parent();
    }

    public void submit() {
        logger.info("saving parent information [" + parent + "]");
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "New Parent successfully inserted.", null));
        parent.save();

    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String search() {
        logger.info("search for parent by full name[" + parent.getFullName() + "]");
        setParentList(parent.searchParentByfullName(parent.getFullName()));
        return "searchParentList";
    }

    /**
     * @return the parentList
     */
    public List<Parent> getParentList() {
        return parentList;
    }

    /**
     * @param parentList the parentList to set
     */
    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    /**
     * @return the genderList
     */
    public List<String> getGenderList() {
        return genderList;
    }

    /**
     * @param genderList the genderList to set
     */
    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }

    public void setInitialDateLoaderUtil(InitialDateLoaderUtil initialDateLoaderUtil) {
        this.initialDateLoaderUtil = initialDateLoaderUtil;
    }
}
