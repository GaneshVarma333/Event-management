package edu.neu.universityeventmanagementsystem.business.repository;

import edu.neu.universityeventmanagementsystem.business.entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * RolesRepository class
 *
 * @author Raghavan Renganathan <{renganathan.r@husky.neu.edu}>
 * @version 1.0
 * @since 4/9/18
 */
@Repository
public interface RolesRepository extends JpaRepository<RolesEntity, Integer> {
    @Query("SELECT r FROM RolesEntity r WHERE LOWER(r.name) = LOWER(:name)")
    List<RolesEntity> findByName(@Param("name") String role);

    @Query("SELECT r FROM RolesEntity r WHERE r.name LIKE CONCAT('%', :name, '%')")
    List<RolesEntity> findAllByNamesLike(@Param("name") String name);
}