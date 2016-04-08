package software.snowball.loworbitircannon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zachrudy on 3/21/16.
 * I know this code is super bad, but I'm still working on it
 */
public class BrandConst {

    private List<int[]> NEC;
    private List<int[]> Epson;
    private List<int[]> Samsung;

    //IR codes for NEC
    final String[] funcs = {"power", "poweron", "poweroff", "input", "focusp", "focusm", "brightnessp", "brightnessm", "contrastp", "contrastm",
            "setup", "zoomp", "zoomm", "picmute", "keylock", "select", "up", "down", "left", "right", "volup", "voldown"};
    final int[] NECp = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564,
            564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECpOn = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564,
            564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564,
            564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECpOff = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECinput = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564,
            1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564,
            1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECfocusp = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECfocusm = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564,
            564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECbrightnessp = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564,
            564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECbrightnessm = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 40884};
    final int[] NECcontrastp = {}; //raise contrast
    final int[] NECcontrastm = {}; //lower contrast
    final int[] NECsetup = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564,
            564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECzoomp = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564,
            564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 40884}; //zoom towards
    final int[] NECzoomm = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 564, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 40884}; //zoom away
    final int[] NECpicmute = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 40884}; //mutes picture
    final int[] NECkeylock = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692,
            564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 40884}; //unknown purpose (for testing)
    final int[] NECselect = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564,
            564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 564, 564,
            1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECup = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564,
            564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 40884};
    final int[] NECdown = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564,
            564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 1692, 564, 40884};
    final int[] NECleft = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECright = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564,
            564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 564, 564, 1692, 564,
            1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 40884};
    final int[] NECvolup = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564,
            564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 1692, 564,
            1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 40884};
    final int[] NECvoldown = {9024, 4512, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 564, 564, 1692, 564, 564, 564,
            564, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 1692, 564, 564, 564, 564, 564, 1692, 564,
            1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 1692, 564, 1692, 564, 564, 564, 564, 564, 40884};

    //Epson commands
    final int[] Epp = {};
    final int[] EppOn = {};
    final int[] EppOff = {};
    final int[] Epinput = {};
    final int[] Epfocusp = {};
    final int[] Epfocusm = {};
    final int[] Epbrightnessp = {};
    final int[] Epbrightnessm = {};
    final int[] Epcontrastp = {};
    final int[] Epcontrastm = {};
    final int[] Epsetup = {};
    final int[] Epzoomp = {};
    final int[] Epzoomm = {};
    final int[] Eppicmute = {};
    final int[] Epkeylock = {};
    final int[] Epselect = {};
    final int[] Epup = {};
    final int[] Epdown = {};
    final int[] Epleft = {};
    final int[] Epright = {};
    final int[] Epvolup = {};
    final int[] Epvoldown = {};

    //Samsung commands
    final int[] Samp = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 65, 22, 65, 22,
            65, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] SamOn = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 65, 22, 65, 22, 65,
            22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] SamOff = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 65, 22, 65,
            22, 65, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Saminput = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65,
            22, 65, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samfocusp = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samfocusm = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Sambrightnessp = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Sambrightnessm = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samcontrastp = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samcontrastm = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samsetup = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samzoomp = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Samzoomm = {0, 108, 0, 34, 173, 173, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 22,
            22, 22, 22, 22, 22, 22, 22, 22, 22, 65, 22, 65, 22, 65, 22, 65, 22, 65, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22,
            22, 65, 22, 65, 22, 65, 22, 1787};
    final int[] Sampicmute = {};
    final int[] Samkeylock = {};
    final int[] Samselect = {};
    final int[] Samup = {};
    final int[] Samdown = {};
    final int[] Samleft = {};
    final int[] Samright = {};
    final int[] Samvolup = {};
    final int[] Samvoldown = {};

    //I understand that this is super immature code
    public BrandConst() {
        NEC = new ArrayList<>();
        Epson = new ArrayList<>();
        Samsung = new ArrayList<>();

        NEC.add(NECp);
        NEC.add(NECpOn);
        NEC.add(NECpOff);
        NEC.add(NECinput);
        NEC.add(NECfocusp);
        NEC.add(NECfocusm);
        NEC.add(NECbrightnessp);
        NEC.add(NECbrightnessm);
        NEC.add(NECcontrastp);
        NEC.add(NECcontrastm);
        NEC.add(NECsetup);
        NEC.add(NECzoomp);
        NEC.add(NECzoomm);
        NEC.add(NECpicmute);
        NEC.add(NECkeylock);
        NEC.add(NECselect);
        NEC.add(NECup);
        NEC.add(NECdown);
        NEC.add(NECleft);
        NEC.add(NECright);
        NEC.add(NECvolup);
        NEC.add(NECvoldown);
        Epson.add(Epp);
        Epson.add(EppOn);
        Epson.add(EppOff);
        Epson.add(Epinput);
        Epson.add(Epfocusp);
        Epson.add(Epfocusm);
        Epson.add(Epbrightnessp);
        Epson.add(Epbrightnessm);
        Epson.add(Epcontrastp);
        Epson.add(Epcontrastm);
        Epson.add(Epsetup);
        Epson.add(Epzoomp);
        Epson.add(Epzoomm);
        Epson.add(Eppicmute);
        Epson.add(Epkeylock);
        Epson.add(Epselect);
        Epson.add(Epup);
        Epson.add(Epdown);
        Epson.add(Epleft);
        Epson.add(Epright);
        Epson.add(Epvolup);
        Epson.add(Epvoldown);
        Samsung.add(Samp);
        Samsung.add(SamOn);
        Samsung.add(SamOff);
        Samsung.add(Saminput);
        Samsung.add(Samfocusp);
        Samsung.add(Samfocusm);
        Samsung.add(Sambrightnessp);
        Samsung.add(Sambrightnessm);
        Samsung.add(Samcontrastp);
        Samsung.add(Samcontrastm);
        Samsung.add(Samsetup);
        Samsung.add(Samzoomp);
        Samsung.add(Samzoomm);
        Samsung.add(Sampicmute);
        Samsung.add(Samkeylock);
        Samsung.add(Samselect);
        Samsung.add(Samup);
        Samsung.add(Samdown);
        Samsung.add(Samleft);
        Samsung.add(Samright);
        Samsung.add(Samvolup);
        Samsung.add(Samvoldown);
    }

    public int getFr(String brand) {
        int fr = 0;
        switch (brand) {
            case ("NEC"):
                fr = 38000;
                break;
            case ("EPSON"):
                fr = 38000;
                break;
            case ("SAMSUNG"):
                fr = 38000;
                break;
            default:
                fr = 38000;
                break;
        }

        return fr;
    }

    public int[] getCommand(String command, String brand) {
        //loop through to find command index
        int index = 0;
        for (int i = 0; i < funcs.length; i++) {
            if (command.equalsIgnoreCase(funcs[i])) {
                index = i;
                break;
            }
        }

        int[] ans;
        switch (brand) {
            case "NEC":
                ans = NEC.get(index);
                break;
            case "EPSON":
                ans = Epson.get(index);
                break;
            case "SAMSUNG":
                ans = Samsung.get(index);
                break;
            default:
                ans = new int[0];
                break;
        }

        return ans;
    }
}
