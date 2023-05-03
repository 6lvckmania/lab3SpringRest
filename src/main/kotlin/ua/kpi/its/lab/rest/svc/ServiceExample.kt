package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.dto.SoftwareModuleRequest
import ua.kpi.its.lab.rest.dto.SoftwareProductRequest
import ua.kpi.its.lab.rest.entity.SoftwareModule
import ua.kpi.its.lab.rest.entity.SoftwareProduct

interface SoftwareModuleService {
    fun createModule(module: SoftwareModuleRequest): SoftwareModule
    fun updateModule(id: Long, module: SoftwareModuleRequest): SoftwareModule
    fun deleteModule(id: Long)
    fun getModuleById(id: Long): SoftwareModule?
    fun getAllModules(): List<SoftwareModule>
}

interface SoftwareProductService {
    fun createProduct(product: SoftwareProductRequest): SoftwareProduct
    fun updateProduct(id: Long, product: SoftwareProductRequest): SoftwareProduct
    fun deleteProduct(id: Long)
    fun getProductById(id: Long): SoftwareProduct?
    fun getAllProducts(): List<SoftwareProduct>
}