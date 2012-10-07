package org.springframework.hateoas.client;

import org.springframework.hateoas.util.Args;

public interface Browser {

    /**
     * Follows a link marked with the given rel
     *
     * @param rel
     * @return Navigator
     */
    public Browser followRel(String rel);

    /**
     * Submits a form which has the given name, filling in the given values.
     *
     * @return
     */
    public Browser submitForm(String name, Args values);



}