package com.agileboot.domain.system.menu.command;

import com.agileboot.domain.system.menu.command.AddMenuCommand;
import com.agileboot.domain.system.menu.model.MenuModel;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateMenuCommand extends AddMenuCommand {

    @NotNull
    private Long menuId;

    @Override
    public MenuModel toModel() {
        MenuModel model = super.toModel();
        model.setMenuId(menuId);
        return model;
    }

}