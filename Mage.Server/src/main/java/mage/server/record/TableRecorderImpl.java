package mage.server.record;

import mage.game.Table;
import mage.game.Table.TableRecorder;
import mage.game.result.ResultProtos.TableProto;
import mage.server.managers.IUserManager;

public class TableRecorderImpl implements TableRecorder {

    private final IUserManager userManager;

    public TableRecorderImpl(IUserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public void record(Table table) {
        TableProto proto = table.toProto();
        TableRecordRepository.instance.add(new TableRecord(proto, proto.getEndTimeMs()));
        userManager.updateUserHistory();
    }
}
