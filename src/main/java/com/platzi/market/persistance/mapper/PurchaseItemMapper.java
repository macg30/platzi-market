package com.platzi.market.persistance.mapper;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistance.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.persistence.ManyToOne;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto",target = "productId"),
            @Mapping(source = "cantidad",target = "quantity"),
            //total es igual tanto en el source como el target
            @Mapping(source = "estado",target = "active"),
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    //@ManyToOne
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra",ignore = true),
            @Mapping(target = "producto",ignore = true),
            @Mapping(target = "id.Compra",ignore = true),
    })
    ComprasProducto toComprasProducto(PurchaseItem item);
}
