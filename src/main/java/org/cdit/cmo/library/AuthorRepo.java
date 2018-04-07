package org.cdit.cmo.library;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.annotation.security.RolesAllowed;

/**
 * Created by admin on 05/04/18.
 */

@RepositoryRestResource(collectionResourceRel = "author",path = "/author")
public interface AuthorRepo extends PagingAndSortingRepository<Author,Long> {

}
