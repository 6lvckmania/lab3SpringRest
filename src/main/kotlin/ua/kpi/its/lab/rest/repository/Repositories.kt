package ua.kpi.its.lab.rest.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ua.kpi.its.lab.rest.entity.SoftwareModule
import ua.kpi.its.lab.rest.entity.SoftwareProduct

@Repository
interface SoftwareModuleRepository : JpaRepository<SoftwareModule, Long>

@Repository
interface SoftwareProductRepository : JpaRepository<SoftwareProduct, Long>
