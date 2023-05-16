package machinepage.domain;

import java.util.List;

import machinepage.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="machines", path="machines")
public interface MachineRepository extends PagingAndSortingRepository<Machine, Long>{
  List<Machine> ();
}
