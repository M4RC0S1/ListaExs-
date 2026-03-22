package RepositoryProjeto;

import ModelProjeto.ModelProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProjeto extends JpaRepository <ModelProjeto, Long> {
}
