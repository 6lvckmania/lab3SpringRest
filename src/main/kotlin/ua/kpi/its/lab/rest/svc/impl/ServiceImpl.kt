package ua.kpi.its.lab.rest.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.dto.SoftwareModuleRequest
import ua.kpi.its.lab.rest.dto.SoftwareProductRequest
import ua.kpi.its.lab.rest.entity.SoftwareProduct
import ua.kpi.its.lab.rest.repository.SoftwareProductRepository
import ua.kpi.its.lab.rest.svc.SoftwareProductService
import ua.kpi.its.lab.rest.entity.SoftwareModule
import ua.kpi.its.lab.rest.repository.SoftwareModuleRepository
import ua.kpi.its.lab.rest.svc.SoftwareModuleService

@Service
class SoftwareModuleServiceImpl(
    private val moduleRepository: SoftwareModuleRepository
) : SoftwareModuleService {

    override fun createModule(module: SoftwareModuleRequest): SoftwareModule {
        val softwareModule = SoftwareModule(
            description = module.description,
            author = module.author,
            language = module.language,
            lastEditDate = module.lastEditDate,
            size = module.size,
            linesOfCode = module.linesOfCode,
            isCrossPlatform = module.isCrossPlatform,
        )
        return moduleRepository.save(softwareModule)
    }

    override fun getModuleById(id: Long): SoftwareModule? {
        return moduleRepository.findById(id).orElse(null)
    }

    override fun updateModule(id: Long, module: SoftwareModuleRequest): SoftwareModule {
        val softwareModule = moduleRepository.findById(id).orElse(null)
            ?: throw RuntimeException("SoftwareModule not found with id: $id")
        softwareModule.description = module.description
        softwareModule.author = module.author
        softwareModule.language = module.language
        softwareModule.lastEditDate = module.lastEditDate
        softwareModule.size = module.size
        softwareModule.linesOfCode = module.linesOfCode
        softwareModule.isCrossPlatform = module.isCrossPlatform
        return moduleRepository.save(softwareModule)
    }

    override fun deleteModule(id: Long) {
        moduleRepository.deleteById(id)
    }

    override fun getAllModules(): List<SoftwareModule> {
        return moduleRepository.findAll()
    }
}

@Service
class SoftwareProductServiceImpl(
    private val productRepository: SoftwareProductRepository
) : SoftwareProductService {

    override fun createProduct(product: SoftwareProductRequest): SoftwareProduct {
        val softwareProduct = SoftwareProduct(
            name = product.name,
            developer = product.developer,
            version = product.version,
            releaseDate = product.releaseDate,
            distributionSize = product.distributionSize,
            architecture = product.architecture,
            isCrossPlatform = product.isCrossPlatform,
        )
        return productRepository.save(softwareProduct)
    }

    override fun getProductById(id: Long): SoftwareProduct? {
        return productRepository.findById(id).orElse(null)
    }

    override fun updateProduct(id: Long, product: SoftwareProductRequest): SoftwareProduct {
        val softwareProduct = productRepository.findById(id).orElse(null)
            ?: throw RuntimeException("SoftwareProduct not found with id: $id")
        softwareProduct.name = product.name
        softwareProduct.developer = product.developer
        softwareProduct.version = product.version
        softwareProduct.releaseDate = product.releaseDate
        softwareProduct.distributionSize = product.distributionSize
        softwareProduct.architecture = product.architecture
        softwareProduct.isCrossPlatform = product.isCrossPlatform
        return productRepository.save(softwareProduct)
    }

    override fun deleteProduct(id: Long) {
        productRepository.deleteById(id)
    }

    override fun getAllProducts(): List<SoftwareProduct> {
        return productRepository.findAll()
    }
}
