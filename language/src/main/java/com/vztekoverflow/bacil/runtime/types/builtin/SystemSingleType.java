package com.vztekoverflow.bacil.runtime.types.builtin;

import com.vztekoverflow.bacil.parser.cli.CLIComponent;
import com.vztekoverflow.bacil.parser.cli.tables.generated.CLITypeDefTableRow;

public class SystemSingleType extends SystemValueTypeType {
    public SystemSingleType(CLITypeDefTableRow type, CLIComponent component) {
        super(type, component);
    }
}