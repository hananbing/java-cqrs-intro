package pl.altkom.asc.lab.cqrs.intro.nocqrs.testdatabuilders

import pl.altkom.asc.lab.cqrs.intro.nocqrs.domain.Cover
import pl.altkom.asc.lab.cqrs.intro.nocqrs.domain.Product


class ProductsTestDataBuilder {

    static Product standardCarInsurance() {
        return new Product(
                UUID.randomUUID(),
                "STD_CAR_INSURANCE",
                "Standard Car Insurance",
                Arrays.asList(
                        new Cover(UUID.randomUUID(), "OC", "Third party liability"),
                        new Cover(UUID.randomUUID(), "AC", "Auto casco"),
                        new Cover(UUID.randomUUID(), "ASSITANCE", "Assistance")
                )
        )
    }
}
